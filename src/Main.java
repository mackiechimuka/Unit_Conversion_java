public class Main {
    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        int choice;
        boolean done = false;
        while (!done){
            choice = convertor.runMenu();
            switch (choice){
                case 1:
                    System.out.println("Convert Gallons To Liters");
                    convertor.convertGalonsToLtrs();
                    break;
                case 2:
                    System.out.println("Convert meters To miles");
                    convertor.convertMetersToMiles();
                    break;
                case 3:
                    System.out.println("Convert grams To carats");
                    convertor.convertGramsToCarats();
                    break;
                case 4:
                    System.out.println("Convert Inches To meters ");
                    convertor.convertInchesToMtrs();
                    break;
                case 5:
                    System.out.println("Convert liters To Gallons");
                    convertor.convertLtrsToGallons();
                    break;
                case 6:
                    System.out.println("Convert grams To kilograms");
                    convertor.convertGmsTokgs();
                    break;
                case 7:
                    System.out.println("Convert Carats To Grams");
                    convertor.convertCaratsToGrams();
                    break;
                default:
                    System.out.println("Exited");
                    done = true;
                    break;
            }
        }
    }
}