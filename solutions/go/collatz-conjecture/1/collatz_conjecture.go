package collatzconjecture

import "errors"

func CollatzConjecture(n int) (int, error) {
	if n <= 0 {
		return 0, errors.New("n must be greater than 0")
	}
	if n == 1 {
		return 0, nil
	} else if n%2 == 0 {
		next, _ := CollatzConjecture(n / 2)
		return 1 + next, nil
	} else {
		next, _ := CollatzConjecture(3*n + 1)
		return 1 + next, nil
	}
}
