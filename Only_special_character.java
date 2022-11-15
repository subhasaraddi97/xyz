import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Only_special_character {
public static void main(String[] args) {
	Pattern p = Pattern.compile("\\d");
	Matcher m = p.matcher("birufh$#h2iug^(");
	while(m.find()) {
		System.out.println(m.group()+"..."+m.start());
	}
}
}
