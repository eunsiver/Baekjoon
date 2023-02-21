#include<stdio.h>
#include<string.h>
#include <stdlib.h>
#pragma warning (disable:4996)
int main()
{
	char str[101],ar[100][101];
	int i,a=0,b=0;
	scanf("%s", str);
	for (i = 0; i <=strlen(str); i++){
		if (str[i] == '-') {
			ar[a][b] = '\0';
			a++;
			b = 0;
			continue;
		}
		ar[a][b] = str[i];
		b++;

		
	}
	char br[101];
	
	for (i = 0; i <= a; i++)
	{
		br[i] = ar[i][0];
		
	}
	br[i] = NULL;
	printf("%s", br);
}