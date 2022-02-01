import java.util.List;
import java.util.ArrayList;
class PythagoreanTriplet
{
    private int side1,side2,side3;
    private static int maximum;
    
    private static List<PythagoreanTriplet> tripletsList = new ArrayList<>();
    private static PythagoreanTriplet instance = new PythagoreanTriplet();
    
    public PythagoreanTriplet()
    {
        
    }
    
    public PythagoreanTriplet(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public static PythagoreanTriplet makeTripletsList()
    {
        tripletsList = new ArrayList<>();
        return instance;
    }
    
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit)
    {
        return instance;
    }
    
    public static PythagoreanTriplet thatSumTo(int sum)
    {
        maximum = sum;
        return instance;
    }
    
    public static List<PythagoreanTriplet> build()
    {
        for(int firstNumber = 1; firstNumber<=maximum/3; firstNumber++)
        {
            for(int secondNumber=firstNumber+1; secondNumber<=(maximum-firstNumber)/2; secondNumber++)
            {
                int thirdNumber = maximum-firstNumber-secondNumber;
                if (Math.pow(firstNumber,2) + Math.pow(secondNumber,2) == Math.pow(thirdNumber,2))
                {
                    tripletsList.add(new PythagoreanTriplet(firstNumber,secondNumber,thirdNumber));
                }
            }
        }
        return tripletsList;
    }
    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof PythagoreanTriplet))
        {
            return false;
        }
        PythagoreanTriplet triplet = (PythagoreanTriplet) other;
        if ((this.side1 == triplet.side1 ) && (this.side2==triplet.side2) && (this.side3 == triplet.side3))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}