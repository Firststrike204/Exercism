class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake == false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake; 
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return archerIsAwake == false && prisonerIsAwake == true;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean dogRescue = petDogIsPresent && !archerIsAwake;
        boolean stealthRescue = !knightIsAwake && !archerIsAwake && prisonerIsAwake;
        return dogRescue || stealthRescue;
    }
}
