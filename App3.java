class App3 {
    public static void main(String args[]) {
        double kilometers = 477.51;
        short minutes; 
        short days = 7; 
        double accountBalance = 2000;
        
        double kmTotal = 2*kilometers;
        System.out.println("***Kilka danych na temat mojej ostatniej podr�y do Kudowy Zdroju:***");
        System.out.println(); 
        System.out.println("��cznie przejechanych km: "+kmTotal);
        System.out.println(); 
        
        short minPerHour = 60;
        short hrsPerDay = 24;
        int minTotal = minPerHour*hrsPerDay*days; 
        System.out.println("��cznie minut sp�dzonych w podr�y: "+minTotal);
        System.out.println(); 
        
        double ratePerDay = accountBalance/days;
        System.out.println("Koszt podr�y w przeliczeniu na jeden dzie�: "+ratePerDay);
        System.out.println(); 
        double ratePerHour = accountBalance/(days*hrsPerDay);
        System.out.println("Koszt podr�y w przeliczeniu na jedn� godzin�: "+ratePerHour);
        System.out.println(); 
        double ratePerMin = accountBalance/(days*hrsPerDay*minPerHour);
        System.out.println("Koszt podr�y w przeliczeniu na jedn� minut�: "+ratePerMin);
        System.out.println(); 
        
    }
}