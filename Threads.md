## Threads 
- Thread: 
	- Lightweight sub process. 
	- Smallest independent unit of a program.
	- `java.lang` package
- Life cycle
	- New: Create a thread. just born thread.
	- Runnable: starts the thread. 
	- Running: run() state and move to yeild() (back to Runnable)
	- Waiting: Temporarily inactive. it can be waiting, blocked and sleeping state.
	- Terminated: Completes it's task.
- Multithreading : To execute more than one thread concurrently. When threads deals with same object. The Synchronization is the keyword for the method to make the threads execute one after the other. `join()`; `synchronized method()`
- Thread pool : Contains a queue for tasks and threads will pick from the queue.
- main() is the main thread in Java
- long running operations should not put load on main method instead it has to be separate thread.
- `Thread class` - use extends and implement run() method. - tight coupling
- `Runnable Interface` - @Override run() method. - lose couplings	
- `run()` method will be invoked by object.start() method.
- MULTIPLE INHERITANCE is not supported in Java so use Runnable Interface in such case.
- Unique object created and memory consumption increase.

### Audio file example:

- when user plays - new thread is created
- when starts playing - it starts with running and then move to runnable
- when pause - waiting 
- when stop - terminated

