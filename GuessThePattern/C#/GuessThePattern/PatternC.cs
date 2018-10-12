using System.Collections.Generic;

namespace GuessThePattern
{
    public abstract class Foo
    {
        private readonly List<Bar> _list = new List<Bar>();

        public void Attach(Bar bar)
        {
            _list.Add(bar);
        }

        public void Detach(Bar bar)
        {
            _list.Remove(bar);
        }

        public void Notify()
        {
            foreach (var o in _list)
            {
                o.Update();
            }
        }
    }

    public abstract class Bar
    {
        protected readonly Foo Foo;

        protected Bar(Foo foo)
        {
            Foo = foo;
        }

        public abstract void Update();
    }
}

/* Write your answers and comments below this line

*/
