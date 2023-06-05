
 class Task2 {
    public static void task2(String[] args) {
        for (Stallaggio stallaggio : stallaggi) {
            if (stallaggio.getStato().equals("fuori servizio")) {
                System.out.println(stallaggio.getCodice());
            }
        }
    }
}
