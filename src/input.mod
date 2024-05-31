MODULE OssSample;

	PROCEDURE BubbleSort;
    VAR n, i, j, temp: INTEGER;
        a: ARRAY 10 OF INTEGER;
    BEGIN
        Read(n);
        i := 0;
        WHILE i < n DO
            Read(a[i]);
            i := i + 1;
        END;

        i := 0;
        WHILE i < n - 1 DO
            j := 0;
            WHILE j < n - i - 1 DO
                IF a[j] > a[j + 1] THEN
                    temp := a[j];
                    a[j] := a[j + 1];
                    a[j + 1] := temp;
                END;
                j := j + 1;
            END;
            i := i + 1;
        END;

        i := 0;
        WHILE i < n DO
            Write(a[i]);
            i := i + 1;
        END;
        WriteLn;
    END BubbleSort;

	PROCEDURE ReverseArray;
		VAR n, i, temp: INTEGER;
			a: ARRAY 10 OF INTEGER;
			b: ARRAY 10 OF INTEGER;
		BEGIN
			Read(n);
			i := 0;

			WHILE i < n DO
				Read(a[i]);
				i := i + 1;
			END;

			i := 0;
			WHILE i < n DO
				temp := a[i];
				b[n - i - 1] := temp;
				i := i + 1;
			END;

			i := 0;
			WHILE i < n DO
				Write(b[i]);
				i := i + 1;
			END;
			WriteLn;
		END ReverseArray;

	PROCEDURE PowerOfTwo;
		VAR n, result, i: INTEGER;
		BEGIN
			Read(n); result := 1; i := 1;
			WHILE i <= n DO
				result := result * 2;
				i := i + 1;
			END;
			Write(result); WriteLn;
		END PowerOfTwo;

	PROCEDURE Factorial;
		VAR n, result, i: INTEGER;
		BEGIN
			Read(n); result := 1; i := 1;
			WHILE i <= n DO
				result := result * i;
				i := i + 1;
			END;
			Write(result); WriteLn;
		END Factorial;

    PROCEDURE Multiply;
        VAR x, y, z: INTEGER;
        BEGIN
            Read(x); Read(y); z := 0;
            WHILE x > 0 DO
                IF x MOD 2 = 1 THEN z := z + y END;
                y := 2 * y; x := x DIV 2
            END;
            Write(x); Write(y); Write(z); WriteLn
        END Multiply;

	PROCEDURE Divide;
		VAR x, y, r, q, w: INTEGER;
		BEGIN
			Read(x); Read(y); r := x; q := 0; w := y;
			WHILE w <= r DO w := 2 * w END;
			WHILE w > y DO
				q := 2 * q; w := w DIV 2;
				IF w <= r THEN r := r - w; q := q + 1 END
			END;
			Write(x); Write(y); Write(q); Write(r); WriteLn
		END Divide;

	PROCEDURE BinSearch;
		VAR i, j, k, n, x: INTEGER;
			a: ARRAY 32 OF INTEGER;
		BEGIN
			Read(n); k := 0;
			WHILE k < n DO Read(a[k]); k := k + 1 END;
			Read(x); i := 0; j := n;
			WHILE i < j DO
				k := (i + j) DIV 2;
				IF x < a[k] THEN j := k ELSE i := k + 1 END
			END;
			Write(i); Write(j); Write(a[j]); WriteLn
		END BinSearch;

	PROCEDURE Fibonacci;
		VAR t1, t2, i, n, result: INTEGER;
	BEGIN
		Read(n); i := 0; t1 := 0; t2 := 1;
		Write(t1); Write(t2);
		WHILE i < n - 1 DO
			result := t1 + t2;
			t1 := t2;
			t2 := result;
			i := i + 1;
			Write(result);
		END;
		WriteLn;
	END Fibonacci;

	PROCEDURE SumOfSeries;
        VAR n, i, sum: INTEGER;
        BEGIN
            Read(n); i := 1; sum := 0;
            WHILE i <= n DO
                sum := sum + i;
                i := i + 1;
            END;
            Write(sum); WriteLn;
        END SumOfSeries;

    PROCEDURE SwapElements;
        VAR n, i, temp: INTEGER;
            a: ARRAY 10 OF INTEGER;
        BEGIN
            Read(n); i := 0;
            WHILE i < n DO
                Read(a[i]);
                i := i + 1;
            END;
            i := 0;
            WHILE i < n - 1 DO
                temp := a[i];
                a[i] := a[i + 1];
                a[i + 1] := temp;
                i := i + 2;
            END;
            i := 0;
            WHILE i < n DO
                Write(a[i]);
                i := i + 1;
            END;
            WriteLn;
        END SwapElements;

END OssSample.