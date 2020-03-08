public class Selection
{
    public static void sort(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int min_place = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (less(a[j], a[min_place]))
                    min_place = j;
            }
            exch(a, i, min_place);
        }
    }
}