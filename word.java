public class Word
{
  private String word;

  public Word(String word) 
  {
    this.word = word;
  }

  public String getSubstrings()
  {
    for(int j = 1; j <= this.word.length(); j++)
    {
      for(int i = j; i <= this.word.length(); i++)
      {
        System.out.println(this.word.substring(i-j, i));
      }
    }
    
    return "";
  }
}