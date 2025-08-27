
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumCount = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sumCount += birdsPerDay[i];
        }
        return sumCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4) {
                busyDays ++;
            }
        }
        return busyDays;
    }
}
