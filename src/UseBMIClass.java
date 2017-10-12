public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Michael", 24, 167, 70);
        System.out.println("The BMI for " + bmi1.getNavn() + " is " + bmi1.getBMI() + " " + bmi1.getStatus() + "." );
        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getNavn() + " is " + bmi2.getBMI() + " " + bmi2.getStatus() + "." );
        BMI bmiTest = new BMI("Anders", 50, 180, 55);
        System.out.println("The BMI for " + bmiTest.getNavn() + " is " + bmiTest.getBMI() + " " + bmiTest.getStatus() + ".");
        System.out.println("Weight: " + bmiTest.getWeight() + " kilograms." + "Height: " + bmiTest.getHeight() + " centimeters.");

    }
}
