int main()
{
	int n;
	scanf("%d", &n);
	int i, sum = 0;
	char ar[101];
	scanf("%s", ar);
	for (i = 0; i < n; i++) {
		sum += ar[i] - '0';
	}
	printf("%d", sum);
}