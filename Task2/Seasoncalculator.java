class SeasonCalculator {
    public static void main(String[] args) {
        int month = 9; // Example month to calculate the season

        String season = calculateSeason(month);

        System.out.println("The season for month " + month + " is " + season + ".");
    }

    public static String calculateSeason(int month) {
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
                break;
        }

        return season;
    }
}
