package de.galperin.javase8.capitel1;

import de.galperin.javase8.Exercise;
import org.junit.Test;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class C1E1 implements Exercise {

    @Test
    @Override
    public void perform() {
        final long currentThreadId = Thread.currentThread().getId();
        System.out.println("current thread id is "+currentThreadId);
        String[] array = getWordsAsArray();
        System.out.println("input array is "+Arrays.toString(array));
        CopyOnWriteArraySet<Long> threadIds = new CopyOnWriteArraySet<>();

        //sort
        Arrays.sort(array, (a, b) -> {
            long id = Thread.currentThread().getId();
            System.out.println("sort id is "+id);
            threadIds.add(Thread.currentThread().getId());
            return a.compareTo(b);
        });
        assertEquals(1, threadIds.size());
        assertEquals(currentThreadId, threadIds.toArray()[0]);

        //cleanup
        threadIds.clear();

        //parallelSort
        Arrays.parallelSort(array, (a, b) -> {
            long id = Thread.currentThread().getId();
            System.out.println("parallel sort  id is "+ id);
            threadIds.add(id);
            return a.compareTo(b);
        });
        assertTrue(threadIds.size() > 1);
    }

}
