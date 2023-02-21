#include<stdio.h>
#include<string.h>
#include <stdlib.h>
#pragma warning (disable:4996)
int main()
{
	char str[101];
	int i,a=0,b=0;
	gets(str); 
	for (i = 0; i <= strlen(str); i++) {
		if (str[i] >= 'A' && str[i] <= 'Z') {
			if (str[i] > 'M')
			{
				str[i] = str[i] + 13 - 26;

			}
			else {
				str[i] = str[i] + 13;
			}
		}
		else if (str[i] >= 'a' && str[i] <= 'z') {
			if (str[i] > 'm')
			{
				str[i] = str[i] + 13 - 26;

			}
			else {
				str[i] = str[i] + 13;
			}
		}
		else {
			str[i] = str[i];
		}
	}
	printf("%s", str);
}