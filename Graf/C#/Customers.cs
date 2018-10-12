namespace Graf
{
	public class Customers
	{
		private Customers(Customers next, string person)
		{
			Next = next;
			Person = person;
		}

		public Customers Next { get; }
		public string Person { get; }

		public Customers Previous(string person)
		{
			return new Customers(this, person);
		}

		public static Customers Create(string person)
		{
			return new Customers(null, person);
		}
	}
}
