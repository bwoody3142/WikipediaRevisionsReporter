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

These twos approaches look pretty similar on the surface since theyre both looping though 

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

