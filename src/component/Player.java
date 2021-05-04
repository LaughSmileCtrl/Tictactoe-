package component;

public enum Player {
    PLAYERX('X'),
    PLAYERO('O');

    private int[] position = new int[5];
    private final char icon;

    Player(char icon) {
        this.icon = icon;
    }

    public char getIcon() {
        return icon;
    }

    public void addPosition(int insertPosition) throws IllegalStateException{
        if (insertPosition < 1 || insertPosition > 9) {
            throw new IllegalStateException("Out of Bounds");
        }
        int lastIndex = getLastIndex();
        position[lastIndex] = insertPosition;
        sortPosition();
    }

    public int[] getPositions() {
        return position;
    }

    private int getLastIndex() {
        for (int i = 0; i < 5; i++) {
            if (position[i] == 0) {
                return i;
            }
        }

        return 9;
    }

    private void sortPosition() {
        for (int i = 0; i < position.length; i++) {
            int iMin = i;
            for (int j = i; j < position.length; j++) {
                if (position[j] < position[iMin]) {
                    iMin = j;
                }
            }

            if (iMin != i && position[iMin] != 0) {
                int tmp = position[iMin];
                position[iMin] = position[i];
                position[i] = tmp;
            }
        }
    }
}
