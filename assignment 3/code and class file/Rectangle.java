public class Rectangle {
    public static void main(String[] args) {
        // If you want to take input from command line
        if (args.length != 2) {
            System.out.println("Please provide width and height as command line arguments.");
            System.out.println("Example: java Rectangle 4.5 7.9");
            return;
        }

        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
