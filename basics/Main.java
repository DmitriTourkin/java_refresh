class Main {

  // Creating Values with Literals
  boolean result = true;
  char capitalC = 'C';
  byte b = 100;
  short s = 10_000;
  int i = 10_000_000;

  //undersocre cannot be after all number literal, before number type suffix _L/D.
  int x6 = 0x5_2;
  int x7 = 0x52; //0x52_ INCORRECT
  int x8 = 0x5_____2;
  float pi1 = 3.1415F; 
  long socialSecurityNumber1 = 999_99_9999L;


  // Integers' literal can be with specific prefix (0b — 2, 0x —16)
  int decimalValue = 26;
  int hexadecimalValue = 0x1a;
  int binaryValue = 0b11010;

  // Floating-Point literals (can be expressed by — e/E (scientific notation), F/f (32), D/d (64)
  double d1 = 123.4;
  double d1Same = 1.234e2;
  float f1 = 123.4f;

  // Characters — UTF-16 chars + escape sequences (\b, 't, \n, \r, \", \'
  char C = 'C';
  String textLine = "this is my text line";

  // Class Literal 
  Class<String> classLiteral = String.class;

  // null literal can be used for any REFERENCE type, but NOT for primities.

}