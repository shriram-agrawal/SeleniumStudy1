package pkg1;

import java.util.UUID;
//univrsal unique identifier.
public class UUID_Class {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(UUID.randomUUID());
        }
    }
}
