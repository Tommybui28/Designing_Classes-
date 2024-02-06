public class Computer {

    int storageSpace;
    String printerModel;
    String printMessage;

    public Computer(int storageSpace, String printerModel) {
        this.storageSpace = storageSpace;
        this.printerModel = printerModel;

    }
    public int getCurrentStorage() {
        return this.storageSpace;

    }
    public int getStorage() {
        return this.storageSpace + 256;
    }

//    public String setPrinterModel(String printerModel) {
//        return this.printerModel = printerModel;
//
//    }
    public void printMessage() {
        System.out.println("Hello World!");
    }
}
