package Replits;

public class Assessment2_4AppearsTwice                                                                  //Date: 26 Apr 2020 -- Time: 3:58 PM
	{

	public static void main(String[] args)
	{
		System.out.println(appearsTwice("java", "java is fun because java, is really good"));
	}

	/**
	 * @param target   - string that you need to check.
	 * @param sentence - string where you need to lookup for target.
	 * @return
	 */
	public static boolean appearsTwice(String target, String sentence)
	{
		int count = 0;
		sentence = sentence.replaceAll(",", " ");
		String[] arr1 = sentence.split(" ");
		for (String each : arr1)
		{
			if (each.equals(target))
			{
				count++;
			}
		}

		return count == 2;
	}


	}
