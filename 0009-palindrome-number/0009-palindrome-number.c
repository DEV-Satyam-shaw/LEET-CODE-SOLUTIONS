bool isPalindrome(int x) {
    if (x < 0)
    {
        return 0;
    }
    long pali = 0;
    int rem, original;
    original = x;

    while(x != 0)
    {
        rem = x % 10;
        pali = pali * 10 + rem;
        x = x / 10;
    }

    if(original == pali)
    {
        return 1;
    } else
    {
        return 0;
    }
    
}