package de.galperin.javase8.capitel2;

import de.galperin.javase8.Exercise;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class C2E1 implements Exercise {

    @Test
    @Override
    public void perform() {
        List<String> words = getWordsAsList();
        assertEquals(words.stream().filter(s -> s.length() > 12).count(), countConcurrentWithoutStreams(words));
    }

    private static long countConcurrentWithoutStreams(List<String> words) {
        try {
            System.out.println("no of words to process "+words.size());
            int cores = Runtime.getRuntime().availableProcessors();
            System.out.println("no of cores in my computer "+cores);
            int chunkSize = words.size() / cores;
            System.out.println("chunk size to be processed by each core "+chunkSize);

            List<List<String>> chunks = new LinkedList<>();
            System.out.println("dividing overall work into chunks");
            for (int i = 0; i < words.size(); i += chunkSize) {
                chunks.add(words.subList(i, i + Math.min(chunkSize, words.size() - i)));
            }
            //System.out.println("chunks " +chunks);
            System.out.println("giving chunks to executor service for processing");
            ExecutorService pool = Executors.newFixedThreadPool(cores);
            Set<Future<Long>> set = new HashSet<>();
            for (List<String> strings : chunks) {
                Callable<Long> callable = () -> {
                    long chunkCount = 0;
                    for (String string : strings) {
                        if (string.length() > 12) chunkCount++;
                    }
                    return chunkCount;
                };
                Future<Long> future = pool.submit(callable);
                set.add(future);
            }
            long count = 0;
            for (Future<Long> future : set) {
                count += future.get();
            }
            pool.shutdown();
            return count;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
