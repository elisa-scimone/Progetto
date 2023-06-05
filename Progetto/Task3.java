class Task3 {
    public static void task3(String[] args) {// Task 3
        int totalTecnici = 0;
        int totalCarpentieri = 0;
        int totalFalegnami = 0;

        for (Stallaggio stallaggio : stallaggi) {
            totalTecnici += stallaggio.getTecnici();
            totalCarpentieri += stallaggio.getCarpentieri();
            totalFalegnami += stallaggio.getFalegnami();
        }

        System.out.print(totalTecnici + " " + totalCarpentieri + " " + totalFalegnami);
    }
}