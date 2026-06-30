int romanToInt(char* s) {
    int len = strlen(s);
    int i,result = 0;

    for(i = 0;i < len;i++)
    {
        int value = 0;
        switch(s[i])
        {
            case 'I': value = 1; break;
            case 'V': value = 5; break;
            case 'X': value = 10; break;
            case 'L': value = 50; break;
            case 'C': value = 100; break;
            case 'D': value = 500; break;
            case 'M': value = 1000; break;
            default: value = 0; break;
        }

        if(i+1 < len)
        {
            int nextvalue = 0;
            switch(s[i+1])
        {
            case 'I': nextvalue = 1; break;
            case 'V': nextvalue = 5; break;
            case 'X': nextvalue = 10; break;
            case 'L': nextvalue = 50; break;
            case 'C': nextvalue = 100; break;
            case 'D': nextvalue = 500; break;
            case 'M': nextvalue = 1000; break;
            default: nextvalue = 0; break;
        }

        if(value < nextvalue)
        {
            result = result - value;
            continue;
        }

        }
        result = result + value;
    }
    return result;
}