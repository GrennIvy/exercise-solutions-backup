package logs

// Application identifies the application emitting the given log.
func Application(log string) string {
	app := map[rune]string{
		'❗': "recommendation",
		'🔍': "search",
		'☀': "weather",
	}
	for _, ch := range log {
		if _, ok := app[ch]; ok {
			return app[ch]
		}
	}
	return "default"
}

// Replace replaces all occurrences of old with new, returning the modified log
// to the caller.
func Replace(log string, oldRune, newRune rune) string {
	res := []rune(log)
	for i := range res {
		if rune(res[i]) == oldRune {
			res[i] = newRune
		}
	}
	return string(res)
}

// WithinLimit determines whether or not the number of characters in log is
// within the limit.
func WithinLimit(log string, limit int) bool {
	return len([]rune(log)) <= limit
}
