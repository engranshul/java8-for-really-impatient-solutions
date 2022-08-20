package java_puzzlers.three_puzzlers_with_character.puzzle_13;

public class AnimalFarm {
    public static void main(String[] args) {

        String str1 = "anshul";
        String str2 = "anshul";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("***************************");

        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: "+(pig == dog));
        System.out.println("Animals are equal: "+(pig.equals(dog)));
    }
}

// String Interning is a method of storing only one copy of each distinct String Value,
// which must be immutable.

// == tests whether they refer to precisely the same object

// When comparing object references, u shd use the equals method in preference
// to the == operator unless u need to compare object identity rather than value

// Your code shd rarely, if ever, depend on the interning of string constants.Interning
// was designed solely to reduce the memory footprint of VM, not as  a tool for devs

