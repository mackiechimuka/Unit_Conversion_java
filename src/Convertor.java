import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Convertor {
    private int tabChoice;
    private double gallons;

    private  double meters;
    private  double grams;
    private  double carats;
    private double inches;
    private double liters;
    private String line ="";
    final  private  String SPLITBY =",";
    final private DecimalFormat DF =new DecimalFormat("0.00");
    final private Scanner sc = new Scanner(System.in);

    public int runMenu(){
        System.out.println("=========================");
        System.out.println("Conversion Table");

        System.out.println("1. Gallons To Liters");
        System.out.println("2. Meters To Miles");
        System.out.println("3. Grams To Carats");
        System.out.println("4. Inches To Meters");
        System.out.println("5. Liters To Gallons");
        System.out.println("6. Grams To kilograms");
        System.out.println("7. Carats To Grams");
        System.out.println("8. Quit");

        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        tabChoice = sc.nextInt();
        while (tabChoice <1 || tabChoice>8){
            System.out.println("Invalid Choice ,Enter the correct option");
            tabChoice = sc.nextInt();
        }
        return  tabChoice;
    }

    public void convertGalonsToLtrs(){

        try {
            System.out.print("Enter the Gallon: ");
            gallons = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String,String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line =br.readLine() )!= null){
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value =  unitsCon[1];
                conParams.put(key,value);
            }
            double galonToLtrCon = Double.parseDouble(conParams.get("galonToLiters"));
            double liters = gallons * galonToLtrCon;
            System.out.println("Liters:"+DF.format(liters));

        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }

    }


    public void convertMetersToMiles(){
        try {
            System.out.print("Enter the Meter: ");
            meters = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String,String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line = br.readLine())!= null){
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value =  unitsCon[1];
                conParams.put(key,value);
            }
            double mtrsToMiles = Double.parseDouble(conParams.get("metersToMiles"));
            double miles = mtrsToMiles * meters;
            System.out.println("Miles: "+DF.format(miles));
        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void convertGramsToCarats(){
        try {
            System.out.print("Enter Grams: ");
            grams = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String,String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line = br.readLine())!= null){
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value =  unitsCon[1];
                conParams.put(key,value);
            }
            double gramsToCarats = Double.parseDouble(conParams.get("gramsToCarats"));
            double carats = gramsToCarats * grams;
            System.out.println("Carats: "+ DF.format(carats)) ;
        }
        catch (IOException io){
            io.printStackTrace();
        }

        catch (Exception e){
            e.getMessage();
        }
    }

    public void convertCaratsToGrams(){
        try {
            System.out.print("Enter Carats:  ");
            carats = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String,String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line = br.readLine())!= null){
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value =  unitsCon[1];
                conParams.put(key,value);
            }
            double caratsToGrams = Double.parseDouble(conParams.get("caratsToGrams"));
            double grams = carats * caratsToGrams;
            System.out.println("Grams: "+ DF.format(grams));

        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void convertInchesToMtrs(){
        try{
            System.out.print("Enter Inches: ");
            inches = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String,String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line = br.readLine())!= null){
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value =  unitsCon[1];
                conParams.put(key,value);
            }
            double incToMtrs = Double.parseDouble(conParams.get("inchToMeters"));
            double meters = inches *incToMtrs;
            System.out.println("Meters: "+ DF.format(meters));
        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void convertLtrsToGallons () {
        try {
            System.out.print("Enter Liters: ");
            liters = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String, String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line = br.readLine()) != null) {
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value = unitsCon[1];
                conParams.put(key, value);
            }
            double ltrsToGallons = Double.parseDouble(conParams.get("inchToMeters"));
            double gallons = liters * ltrsToGallons;
            System.out.println("Gallons: " + DF.format(gallons));
        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void convertGmsTokgs() {
        try {
            System.out.print("Enter grams: ");
            grams = sc.nextDouble();
            HashMap<String, String> conParams = new HashMap<String, String>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mcneill\\IdeaProjects\\UnitConverter\\src\\conversionConst.csv"));
            while ((line = br.readLine()) != null) {
                String[] unitsCon = line.split(SPLITBY);
                String key = unitsCon[0];
                String value = unitsCon[1];
                conParams.put(key, value);
            }
            double gmsToKgs = Double.parseDouble(conParams.get("gramsToKgs"));
            double kgs = grams * gmsToKgs;
            System.out.println("Kgs: "+DF.format(kgs));


        }
        catch (IOException io){
            io.printStackTrace();
        }
        catch (Exception e){
            e.getMessage();
        }
    }

}