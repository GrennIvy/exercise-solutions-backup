package hamming

import "errors"

func Distance(a, b string) (int, error) {
	if len(a) != len(b) {
		return 0, errors.New("The two strings must be of the same length.")
	}
	res := 0
	for i := 0; i < len(a); i++ {
		if a[i] != b[i] {
			res++
		}
	}
	return res, nil
}
