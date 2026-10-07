#!/usr/bin/env python3

import sys
for line in sys.stdin:
	for word in line.split():
		if word.startswith("#"):
			print(word, 1)
