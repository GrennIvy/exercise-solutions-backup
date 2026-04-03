package luhn

import "strings"

func Valid(id string) bool {
	id = strings.ReplaceAll(id, " ", "")
	n := len(id)
	if n < 2 {
		return false
	}
	s := 0
	for i := 0; i < len(id); i++ {
		t := int(id[n-1-i] - '0')
		if t < 0 || t > 9 {
			return false
		}
		if i%2 == 1 {
			t *= 2
			if t > 9 {
				t -= 9
			}
		}
		s += t
	}
	return s%10 == 0
}
