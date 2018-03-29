#!/bin/sh

STR="first second -Dssh.port=1001 -X:param1 -XX:+param2 third -javaagent"

isNotMatchSetEnv(){
	if [[ $1 != \-X* && \
			$1 != \-Dssh.port* && \
			$1 != \-javaagent* ]] ; then
		return 0;
	fi

	return 1;
}

for opt in $STR
do
    if isNotMatchSetEnv $opt ; then
		FILTERED_STR+="$opt "
	fi
done

echo "$FILTERED_STR"