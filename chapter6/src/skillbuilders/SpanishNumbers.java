package skillbuilders;

public class SpanishNumbers 
{
    public static void displayNumberInSpanish(int number) 
    {
        String spanishWord;

        switch (number) 
        {
            case 1: spanishWord = "uno"; break;
            case 2: spanishWord = "dos"; break;
            case 3: spanishWord = "tres"; break;
            case 4: spanishWord = "cuatro"; break;
            case 5: spanishWord = "cinco"; break;
            case 6: spanishWord = "seis"; break;
            case 7: spanishWord = "siete"; break;
            case 8: spanishWord = "ocho"; break;
            case 9: spanishWord = "nueve"; break;
            case 10: spanishWord = "diez"; break;
            default: spanishWord = "Number out of range"; break;
        }

        System.out.println(number + " -> " + spanishWord);
    }

    // Main method
    public static void main(String[] args) 
    {
        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) 
        {
            displayNumberInSpanish(i);
        }
    }
}
