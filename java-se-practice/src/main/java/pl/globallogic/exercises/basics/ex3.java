package pl.globallogic.exercises.basics;



public class ex3{

    //megabytes converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value"); // to nam wydrukuje  "Invalid Value" jak kiloBytes bedzie mniej jak 0
        } else {
            int megaBytes = kiloBytes / 1024; // dzielimy kiloBytes przez 1024
            int remainingKiloBytes = kiloBytes % 1024; // reszta z dzielenia przez 1024

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
            // no i printujemy w formacie "XX KB = YY MB and ZZ KB"
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
