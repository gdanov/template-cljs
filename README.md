# template-cljs

template project for cljs and figwheel-main using clj-cli and also support for latest CIDER

# connecting with CIDER

my preferred approach is to start figwheel in separate terminal via
>clj -A:fig:bs

and then in emacs do ```cider-connect```. This gives you clj repl. Next you do ```(figwheel.main.api/cljs-repl "dev")``` to start the cljs repl.

## altentative way

thanks to the .dir-locals (credit to https://github.com/arichiardi/figwheel-main-cider.git) you can just do ```cider-jack-in-cljs``` and you'll get clj repl in which figwheel will be started.

take care to put the right build id.

## one more alrnative

this works as well, but is not to my liking. shell script that does
```clj -A:fig -e '(require (quote cider-nrepl.main)) (cider-nrepl.main/init ["cider.nrepl/cider-middleware"])' -m figwheel.main --build dev --repl```


