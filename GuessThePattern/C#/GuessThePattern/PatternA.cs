using System;

namespace GuessThePattern
{
    public class PatternA
    {
        private static PatternA _instance;
        private PatternA()
        {
        }

        public static PatternA GetInstance()
        {
            if (_instance == null)
                _instance = new PatternA();

            return _instance;
        }

        public void DoWork()
        {
            throw new NotImplementedException();
        }
    }
}

/* Write your answers and comments below this line

*/
