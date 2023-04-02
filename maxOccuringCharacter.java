class maxOccuringCharacter {
    public static void main(String[] args) {
        int pos=0;
        String s="thepowerrangers";
        int c=0,t=0,f=0;
        for(int i=0;i<s.length();i++)
        {  c=0;f=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                    if(c>t)
                    {f=1;
                     pos=i;
                    }
                }
            }
            if(f==1)
            t=c;
        }
        System.out.println("maximum occurring character is: " +s.charAt(pos));
    }
}
