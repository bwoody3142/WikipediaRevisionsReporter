# Project Report

Bryce Woody

## Markdown Tips

If you are unfamiliar with MarkDown, check out 
[the official documentation](https://guides.github.com/features/mastering-markdown/).

Note that IntelliJ IDEA has a Markdown preview that you can access in 
the upper-right of the editor. Also, since Markdown documents&mdash;like
source code&mdash;should be human-readable, make sure you keep your lines
short, as you can see I have done in my Markdown files.

Please remove this subsection before submitting your report. 

## Challenge #1 Complete

This challenge was pretty simple and straight forward. In the Guice configuration, 
I changed the `FakeQueryEngine` on line 13 to `WikipediaQueryEngine` so that we would 
actually be utilizing the Wiki API for queries.  

## Challenge #2 Incomplete

I modified the Revision Formatter to read more like natural english. 
I also changed the type of the date/time format to also make that more readable as well. 
That was pretty simple, but I couldn't really figure out how to use Guice to inject a dependency, 
actually at runtime. 

## Challenge #3 Complete

For this I used `stream()` to method chain along with `forEach()` so that I could refactor the for loop
down to just one line. 

## Reflection Question #1: Functional vs OO

These two approaches look pretty similar on the surface since they're both looping though and performing the same act. 
The functional approach is only one line while the iterative is 4 or 5 lines. I think that I prefer the iterative way,
 even though it takes up much more lines I think its easier to read and follow, which would lead me to believe that its 
 the cleaner way as well. Its also easier to debug when you cna step through each line and see exactly what is happening. 

## Reflection Question #2: Polymorphism and Dependency Inversion
The `QueryEngine` is an example of Polymorphism. `FakeQueryEngine` and `WikipediaQueryEngine`
are not known by the module using the interface, which is good because its the job of the `View` to know anything 
about the query engines. This endangered dependency inversion since it did not need to depend on outside classes.


