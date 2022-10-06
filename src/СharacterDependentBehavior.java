public interface СharacterDependentBehavior {

    default void characterDescription(boolean character) {
        if (character == true) {
            System.out.println("характер: спокоен.");
        } else {
            System.out.println("характер: агрессивен.");
        }
    }

    default void characterAction(boolean character) {
        if (character == true) {
            System.out.println("Смотрит томным взглядом, не испытвая интереса. Позволяет даже потрогать себя за хвост.");
        } else {
            System.out.println("Не успеваете подойти к клетке, как животное бросается на вас.");
        }
    }
}
