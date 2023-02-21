#include<stdio.h>
#include<string.h>
#include <stdlib.h>
#pragma warning (disable:4996)
int main()
{
	char str[101],ar[101];
	int i,a=0,b=0;
	gets(str);
	for (i = 0; i <= strlen(str); i++) {
		if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
			ar[a] = str[i];
			a++;
			i = i + 2;
		}
		else {
			ar[a] = str[i];
			a++;
		}

	}
	ar[a] = '\0';
	printf("%s", ar);
}