import java.io.*;

class GOWSHIK {
    
    void matching_string(String pattern,String text)
    {
        
        int pattern_length=pattern.length();
        int text_length= text.length();
        
        // constructing longest prefix suffix
        int longest_prefix_suffix[]=new int[pattern_length];
        compute_longest_prefix_suffix(pattern,longest_prefix_suffix,pattern_length);
        
        //after construction longest_prefix_suffix start matching comparison to text 
        
        int text_index=0, pattern_index=0;
        int count=0;
        while(text_index < text_length)
        {
            if(text.charAt(text_index) == pattern.charAt(pattern_index))  //if Character at index matches then increment text_index and pattern_index
            {
                text_index++;
                pattern_index++;
            }
            
            if(pattern_index == pattern_length)  // this checking gives pattern found as the result
            {
                System.out.println("Found at the index---"+(text_index-pattern_index));
                count++;
                pattern_index=longest_prefix_suffix[pattern_index-1];   // this makes the move to next prefix of pattern available
            }
            else if(text_index < text_length && text.charAt(text_index)!=pattern.charAt(pattern_index))
            {
                if(pattern_index!=0)
                {
                    pattern_index = longest_prefix_suffix[pattern_index-1];    // perform this for searching any other pattern index matches with text using longest_prefix_suffix computation
                }
                else
                {
                    text_index++;      // increment text index because pattern is not found
                }
                
            }
        }
       System.out.println(count);
    }
    
    void compute_longest_prefix_suffix(String pattern,int longest_prefix_suffix[],int pattern_length)
    {
        //intialise for 1st Index
        int len=0,index=1;
        longest_prefix_suffix[0]=0;
        
        //calculating for remaining Characters
        while(index<pattern_length)
        {
            if(pattern.charAt(len)==pattern.charAt(index))
            {
                len++;
                longest_prefix_suffix[index]=len;
                index++;
            }
            else{
                //if len is not 0
                if(len!=0)
                {
                    len=longest_prefix_suffix[len-1];
                }
                else //if len found as 0 then longest_prefix_suffix at that index is also zero
                {
                    longest_prefix_suffix[index]=0;
                    index++;
                }
            }
        }
    }
    
   	public static void main (String[] args) {
	
	String text="Writers write descriptive paragraphs because their purpose is to describe something. Their point is that something is beautiful or disgusting or strangely intriguing. Writers write persuasive and argument paragraphs because their purpose is to persuade or convince someone. Their point is that their reader should see things a particular way and possibly take action on that new way of seeing things. Writers write paragraphs of comparison because the comparison will make their point clear to their readers.";
	String pattern="is";
	new GOWSHIK().matching_string(pattern,text);
	}
}
