; ModuleID = "oberon_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"n" = alloca i32
  store i32 0, i32* %"n"
  store i32 0, i32* %"n"
  br label %"loop_entry"
loop_entry:
  %".5" = load i32, i32* %"n"
  %".6" = icmp slt i32 %".5", 5
  br i1 %".6", label %"loop_body", label %"loop_end"
loop_body:
  br label %"loop_entry"
loop_end:
  %".9" = load i32, i32* %"n"
  %".10" = add i32 %".9", 1
  store i32 %".10", i32* %"n"
  %".12" = load i32, i32* %"n"
  ret i32 %".12"
}
