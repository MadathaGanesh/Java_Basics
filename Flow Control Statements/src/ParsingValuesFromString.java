/*
  Parsing String datatype values to Integer datatype / Integer Value or Double datatype / Double Value .
  parsing means converting .
 */
public class ParsingValuesFromString {
    public static void main(String[] args) {
        String StringValue="2305.124";
        System.out.println("String value is : " +StringValue);
        int intValue=10;

        // After adding integer value to String Value
        /*
        StringValue=StringValue+intValue;
        System.out.println("String value + Integer value is : "+StringValue);
         */

        // Converting StringValue to Integer Datatype value and Adding Integer value
        int convertedIntValue=Integer.parseInt(StringValue);
        convertedIntValue+=intValue;
        System.out.println("Converted Integer Value + Integer value is : "+convertedIntValue);

        double ConvertedDoubleValue=Double.parseDouble(StringValue);
        ConvertedDoubleValue+=intValue;
        System.out.println(" Converted Double Value + Integer Value : "+ConvertedDoubleValue);
    }
}
