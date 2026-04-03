package isogram

import "strings"

var alphabet [26]bool

func IsIsogram(word string) bool {
	for i := range len(alphabet) {
		alphabet[i] = false
	}
	word = strings.ToLower(word)
	for i := 0; i < len(word); i++ {
		if word[i] < 'a' || word[i] > 'z' {
			continue
		}
		if alphabet[word[i]-'a'] {
			return false
		}
		alphabet[word[i]-'a'] = true
	}
	return true
}
