using System;

namespace Graf
{
	class Program
	{
		static void Main(string[] args)
		{
			var curr = Customers
				.Create("Kim")
				.Previous("Hans")
				.Previous("Ole")
				.Previous("Peter");

			while (curr != null)
			{
				if (curr.Next != null)
					Console.Write(curr.Person + " -> ");
				else
					Console.WriteLine(curr.Person);
				curr = curr.Next;
			}
			Console.ReadLine();
		}
	}
}
