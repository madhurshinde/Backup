package logical_Program_IMP;

import org.testng.annotations.Test;

public class string_sample_program {

	@Test(priority = 0)
	public void printEachWord() {
		String s1 = "Gayatri Madhur Shinde";

		String str = "";
		s1 += "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c != ' ')
				str += c;
			else {
				System.out.println(s1);
				str = "";
			}
		}
	}

	@Test(priority = 1)
	public void upperCaseLetter() {
		String s2 = "Gayatri Madhur Shinde";
		int count = 0;
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println(c);
				count++;
			}
		}
		System.out.println();
		System.out.println('c' + "=" + count);
	}

	@Test(priority = 2)
	public void lowerCaseLetter() {

		String s3 = "Gayatri Madhur Shinde";
		int Count = 0;
		for (int i = 0; i < s3.length(); i++) {
			char c = s3.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.print(c);
				Count++;
			}
		}
		System.out.println();
		System.out.println(Count);
	}

	@Test(priority = 3)
	public void printChracterAndDigit() {
		String s4 = "Gayatri1Naresh2Jadhao3";
		String digit = "";
		int digitcount = 0;
		String character = "";
		int charcount = 0;
		for (int i = 0; i < s4.length(); i++) {
			char c = s4.charAt(i);
			if (Character.isDigit(c)) {
				digit = digit + c;
				digitcount++;
			} else {
				character = character + c;
				charcount++;
			}
		}
		System.out.println("digit=" + " " + digitcount + " " + "digit are=" + digit);
		System.out.println("character=" + " " + charcount + " " + "character are=" + character);
	}

	@Test(priority = 4)
	public void stringWithoutWhiteSpace() {
		System.out.println("print string without white space");
		String s5 = "Gayatri 1 Naresh 2 Jadhao 3";
		String withoutwhitespace = "";
		int count = 0;
		for (int i = 0; i < s5.length(); i++) {
			char c = s5.charAt(i);
			if (Character.isLetterOrDigit(c)) {

				withoutwhitespace = withoutwhitespace + c;
				count++;
			}
		}
		System.out.println("withoutwhitespace=" + withoutwhitespace);
		System.out.println("count of character=" + count);
	}

	@Test(priority = 5)
	public void removeWhiteSpace() {
		System.out.println("remove white space i string& print all character");
		String s6 = "Gayatri Naresh Jadhao ";
		String allchar = "";
		int count = 0;
		for (int i = 0; i < s6.length(); i++) {
			char c = s6.charAt(i);
			if (Character.isWhitespace(c)) {
				count++;
			} else {
				allchar = allchar + c;
			}
		}
		System.out.println("count whitespace=" + count);
		System.out.println("without white space=" + allchar);
	}

	@Test(priority = 6)
	public void allSeprate() {
		System.out.println("print seprate all digit,special chracter,chracter");
		String s7 = "Gayatri16&@Naresh01&()Jadhao97 ";
		String alldigit = "";
		String allcharvalue = "";
		String allspecial = "";
		String allchardigit = "";
		for (int i = 0; i < s7.length(); i++) {
			char c = s7.charAt(i);
			if (Character.isLetterOrDigit(c)) { // only add latter and digit
				allchardigit = allchardigit + c;
			} else {
				allspecial = allspecial + c;
			}
		}
		System.out.println(allspecial);
		System.out.println(allchardigit);
		for (int j = 0; j < allchardigit.length(); j++) {
			char chr = allchardigit.charAt(j);
			if (Character.isDigit(chr)) {  //digit 
				alldigit = alldigit + chr;
			} else {
				allcharvalue = allcharvalue + chr;
			}
		}
		System.out.println("alldigit=" + alldigit);
		System.out.println("allspecial=" + allspecial);
		System.out.println("allcharvalue=" + allcharvalue);
	}

	@Test(priority = 7)
	public void uppercaseAndLowercase() {
		System.out.println("print uppercase and lowercase");
		String s8 = "gayatri n jadhao";
		String s9 = "PRATIKSHA BHOYAR";
		String s8upper = "";
		String s9lower = "";
		for (int i = 0; i < s8.length(); i++) {
			char c = s8.charAt(i);
			s8upper = s8upper + Character.toUpperCase(c);
		}
		for (int j = 0; j < s9.length(); j++) {
			char c = s9.charAt(j);
			s9lower = s9lower + Character.toLowerCase(c);
		}
		System.out.println("upper case =" + s8upper);
		System.out.println("lower case =" + s9lower);
	}

	@Test(priority = 8)
	public void eachFirstLetterUppercase() {
		System.out.println("print each first letter is capital");
		String str = "gayatri naresh jadhao";
		String word[] = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			char c = word[i].charAt(0);
			// System.out.println(c);                     //g n j
			String s1 = String.valueOf(c).toUpperCase();
			// System.out.println(c1);                    //G N J
			String s2 = word[i].substring(1);
			// System.out.println(s2);                    //ayatri aresh adhao
			System.out.print(s1 + s2 + " ");              //Gayatri Naresh Jadhao
		}
		System.out.println();
	}

	@Test(priority = 9)
	public void eachFirstLetterLowercase() {
		System.out.println("print esch first letter is lowercase");
		String str = "GAYATRI NARESH JADHAO";
		String word[] = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			char c = word[i].charAt(0);
			// System.out.println(c);                      //G N J
			String s1 = String.valueOf(c).toLowerCase();
			// System.out.println(s1);                     //g n j
			String s2 = word[i].substring(1);
		//	System.out.println(s2);                        //AYATRI ARESH ADHAO
			System.out.println(s1 + s2 + " ");             //gAYATRI nARESH jADHAO
		}
		System.out.println();
	}
}
