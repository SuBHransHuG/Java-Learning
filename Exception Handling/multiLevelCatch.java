public class multiLevelCatch{
    public static void main(String[] args) {
        try{
//        String str = null;
//            System.out.println(str.length());
//        int[] arr = new int[5];
//            System.out.println(arr[10]);
//        int a = Integer.parseInt("abc");
//            System.out.println(a);
//        int b = 10;
//        int c = 0;
//            System.out.println(b/c);
        String str2 = "Subh";
            System.out.println(str2.charAt(10));

        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Arithmetic Exception Occurs.");
            arithmeticException.printStackTrace();
        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception Occurs.");
            nullPointerException.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Array Index Out Of Bounds Exception Occurs.");
            arrayIndexOutOfBoundsException.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println("String Index Out Of Bounds Exception Occurs.");
            stringIndexOutOfBoundsException.printStackTrace();
        }
        catch (NumberFormatException numberFormatException){
            System.out.println("Number format Exception Occurs.");
            numberFormatException.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e + " Occurs.");
            e.printStackTrace();
        }
    }
}
