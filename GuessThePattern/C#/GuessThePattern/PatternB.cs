namespace GuessThePattern
{
    public abstract class SomeObject
    {
    }

    public class ConcreteSomeObject : SomeObject
    {
    }

    public abstract class PatternB
    {
        public abstract SomeObject Create();
    }

    public class ConcretePatternB : PatternB
    {
        public override SomeObject Create()
        {
            return new ConcreteSomeObject();
        }
    }
}

/* Write your answers and comments below this line

*/
