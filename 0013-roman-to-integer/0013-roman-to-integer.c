int value(char s)
{
    switch(s)
    {
        case 'I': return 1; break;
        case 'V': return 5; break;
        case 'X': return 10; break;
        case 'L': return 50; break;
        case 'C': return 100; break;
        case 'D': return 500; break;
        case 'M': return 1000; break;
    }
    return 0;
}
int romanToInt(char* s) {
    int i = 0,result = 0;

    while(s[i] != '\0')
    {
        int num = value(s[i]);
        int num2 = value(s[i+1]);

        if(num < num2 )
        {
            result = result - num;
        } else {
            result = result + num;
        }
        i++;
    }
        
    return result;
}